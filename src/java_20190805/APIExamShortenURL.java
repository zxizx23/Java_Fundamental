package java_20190805;


import bouns.Utility;

public class APIExamShortenURL {
	public static void main(String[] args) {
        String clientId = "Ww5t_Fbqk0O0K2QXo6DD";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "lJRYMKEg8u";//애플리케이션 클라이언트 시크릿값";
        String oriUrl = "https://docs.google.com/spreadsheets/d/1AEbbhYgDMouucbzE4OOxLUXoYLMr2nNyWqE4wq3rTeU/edit#gid=0";
        String url =Utility.getShortenURL(clientId, clientSecret, oriUrl);
        System.out.println(url);
        if(Utility.isQRCode(url, 300, 300)) {
        	System.out.println("QRcode Success");
        }else {
        	System.out.println("QRcode Unsuccess");
        }

	}
}

