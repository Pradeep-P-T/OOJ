class StringDemo{
    public static void main(String args[]){
       
        char c[]={'B','M','S','C','E'};
       
        String s1=new String(c);
        String s2=new String(c,1,3);
        String s3=new String(s1);
       
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
       
        byte ascii[]={74,65,86,65};
       
        String s4=new String(ascii);
        String s5=new String(ascii,1,2);
        String s6=new String(s4);
       
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
       
        System.out.println(s1.length());
        System.out.println("project".length());
        System.out.println();
       
        int weeks=52;
        String s7="A year has "+weeks+" weeks.";
        System.out.println(s7);
        System.out.println();
       
        char ch;
        ch="abc".charAt(1);
        System.out.println(ch);
        System.out.println();
       
        String s8="Welcome to Bmsce college";
        int start=11;
        int end=16;
        char b[]=new char[end-start];
        s8.getChars(start,end,b,0);
        System.out.println(b);
        System.out.println();

        String st="Hello";
        byte[] by=st.getBytes();
        char[] ch_ar=st.toCharArray();
        for(int i=0;i<by.length;i++)
        System.out.print(by[i] + " ");
        System.out.println();
        for(int j=0;j<ch_ar.length;j++)
        System.out.print(ch_ar[j] + " ");
        System.out.println();
        System.out.println();

        String s9="Bmsce";
        String s10="Bmsce";
        String s11="College";
        String s12="BMSCE";
       
        System.out.println(s9+" equals "+s10+" -> "+s9.equals(s10));
        System.out.println(s9+" equals "+s11+" -> "+s9.equals(s11));
        System.out.println(s9+" equals "+s12+" -> "+s9.equals(s12));
        System.out.println(s9+" equals "+s12+" -> "+s9.equalsIgnoreCase(s12));
        System.out.println();
       
        String s13="Welcome to Bmsce College of Engineering";
        String s14="Bmsce College";
        Boolean ismatch=s13.regionMatches(11,s14,0,13);
        if(ismatch)
        System.out.println("substring is matched");
        else
        System.out.println("substring is not matched");
        System.out.println();
       
        Boolean x= "College".startsWith("Col");
        Boolean y="College".endsWith("ige");
        System.out.println(x);
        System.out.println(y);
        System.out.println();
       
        String s15="World";
        String s16=new String(s15);
        System.out.println(s15+" equals "+s16+" -> "+s15.equals(s16));
        System.out.println(s15+" == "+s16+" -> "+(s15==s16));
        System.out.println();
       
        String arr[]={"van", "watch","ball","cat","xmas","yatch","zee","apple","ice","jug","kite","lift","man","net","orange","dog","ent","free","gun","hen","parrot","queen","ring","star","tree","umbrella"};
        for(int j = 0; j < arr.length; j++)
        {
         for(int i = j + 1; i < arr.length; i++)
          {
           if(arr[i].compareTo(arr[j])<0)
            {
             String t = arr[j];
             arr[j] = arr[i]; 
             arr[i] = t;
            }
          }
         System.out.println(arr[j]);
        }
        System.out.println();

        String arr_no[]={"1","3","6","8","4","5","7","9","2"};
        for(int j = 0; j < arr_no.length; j++)
        {
         for(int i = j + 1; i < arr_no.length; i++)
          {
           if(arr_no[i].compareTo(arr_no[j])<0)
            {
             String t1 = arr_no[j];
             arr_no[j] = arr_no[i]; 
             arr_no[i] = t1;
            }
          }
         System.out.println(arr_no[j]);
        }
        System.out.println();

        String s17="Hello";
        String s18=s17.concat("World");
        System.out.println(s18);
        System.out.println();

        String s19="College".replace('l','m');
        System.out.println(s19);
        System.out.println();

        String s20="    Hello Friends    ".trim();
        System.out.println(s20);
        System.out.println();
     }
}
