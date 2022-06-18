class Main 
{
  public static void main(String[] args) 
  {
      int tab [] = new int [5];
    tab [0] = 6;
    tab [1] = 1;
    tab [2] = 4;
    tab [3] = 2;
    tab [4] = 9;
    for (int i = 0; i<5; i++)
      {
        System.out.println("Element tablicy=" + tab[i]);
      }
    int n = 10;
    while (n>=0)
      {
        System.out.println("cokolwiek"+n);
        n--;
      }
    do 
    {
      System.out.println("tekst");
      n++;
    }
    while (n<5);
      {
      System.out.println("koniec");
      }
        int table [] [] = {{2,3,4},{1,2,3}};

    for (int i = 0; i<table.length; i++)
      {
        for (int j = 0;j<table[i].length; j++)
          {
            System.out.println("table [i] [j]");
          }
      }
    
  }
}