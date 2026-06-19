package Jun19;

public class Example {
    public static void main(String[] args){
        String url = "www.example.com?id=100&name=xyz&password=123456&email=xyx@gmail.com";
        extractDataFromUrl(url);
    }

    public static void extractDataFromUrl(String url){
        int indexOfQuestionMark = url.indexOf('?') + 1;
        url = url.substring(indexOfQuestionMark);

        String[] content = url.split("&");
        for(String data: content){
            System.out.println(data);
        }
    }
}
