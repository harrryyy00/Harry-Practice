System.out.println("Enter the First NO: ");
        float a = sc.nextFloat();
        System.out.println("Enter the Second NO: ");
        float b = sc.nextFloat();
        System.out.println("Enter the Operator : ");
        char ch = sc.next().charAt(0);
        float result = 0f;
        switch (ch) {
            case '+': result = a+b;
            
            break;
            case '-': result = a-b;
            break;
            case '*': result = a*b;
            break;
            case '/': result = a/b;
            break;
            case '%': result = a%b;
            break;
        
            default: System.out.println("Enter a valid operator");
            
        }
        System.out.println("Result of " + a + ch + b +" = " + result);
    }
