class Main {
  public static void main(String[] args) {
    String znakchoinki = "^";
    for (int x=0; x<5; x++)
      {
      for (int y=0; y<5*2; y++)
        {
          if (y<(5-x)||y>(5+x)){
          System.out.print(" ");
          
        }
          else {
            System.out.print(znakchoinki);
      }
    }
  System.out.println();
  }
    }
}