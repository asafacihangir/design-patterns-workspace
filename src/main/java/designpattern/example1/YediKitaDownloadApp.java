package designpattern.example1;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class YediKitaDownloadApp {

  public static void main(String[] args) throws IOException {


    final int dergiNo = 149;
    final String uniCode = "dde001309fddb41eaf07258a16ed3955";

    FileOutputStream fos = new FileOutputStream(dergiNo + "_yedikita.zip");
    ZipOutputStream zipOut = new ZipOutputStream(fos);

    for (int i = 1; i <= 84; i++) {
      String pageNum = String.valueOf(i);
      if (i < 10) {
        pageNum = "0" + i;
      }

      final String downloadUrl = createDownloadUrl(DergiType.YEDIKITA, dergiNo, uniCode, pageNum);

      System.out.println(downloadUrl);
      HttpRequest request = HttpRequest.newBuilder()
          .uri(URI.create(downloadUrl))
          .header("Content-Type", "application/json")
          .GET()
          .build();

      try {
        HttpResponse<byte[]> httpResponse = HttpClient.newBuilder()
            .build()
            .send(request, BodyHandlers.ofByteArray());

          ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(httpResponse.body());
          ZipEntry zipEntry = new ZipEntry(pageNum + ".pdf");
          zipOut.putNextEntry(zipEntry);

          byte[] bytes = new byte[1024];
          int length;
          while ((length = byteArrayInputStream.read(bytes)) >= 0) {
              zipOut.write(bytes, 0, length);
          }
          byteArrayInputStream.close();


      } catch (IOException | InterruptedException e) {
        e.printStackTrace();
      }


    }
      zipOut.close();
      fos.close();



  }


  public static String createDownloadUrl(DergiType dergiType, int dergiNo, String uniCode, String pageNum) {
    final String mainUrl = "https://www.edergim.com/public_x/dergi/" +dergiType.getName() +"/";
    final String directoryUrl = "/files/assets/common/downloads/page00";
    final String extension = ".pdf?uni=";

    return mainUrl + dergiNo + directoryUrl + pageNum + extension + uniCode;

  }



}
