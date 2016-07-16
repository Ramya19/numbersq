 while(s!=0)
        {
            t=s%10;
            a=t*t*t;
            sum+=a;
            s=s/10;
            
        }
        if(s==a)
            System.out.println("armstrong");
        else
            System.out.println("not armstromg");
       