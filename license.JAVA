System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Have License?");
        boolean hasLicense = sc.nextBoolean();

        if(age>=18){
            if(hasLicense){
                System.out.println("You can drive.");
            }
        }
        else System.out.println("You can't drive.");
