class CamelCase {
  public static String camelCase(String method, String post){
    String result="";
    method = method.toLowerCase();
    post = post.toLowerCase();
    post = post.replaceAll("[{}]","");
    for(int i =0;i<post.length();i++){
      if(post.charAt(i)=='/'){
        char c = Character.toUpperCase(post.charAt(i+1));
        post = post.replace(post.charAt(i+1),c);
      }
    }
    post = post.replaceAll("/","");
    result = method+post;
    return result;
  }
  public static void main(String[] args) {
    System.out.println(camelCase("GET", "/keyboard/{key}/{MOUSE}"));
  }
}