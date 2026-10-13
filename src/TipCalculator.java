
        double tip = billAmount * tipPercent / 100.0;
        tip = Math.round(tip * 100) / 100.0;

        double total = billAmount + tip;
        total = Math.round(total * 100) / 100.0;

        double perPerson = total / people;
        perPerson = Math.round(perPerson * 100) / 100.0;

        System.out.printf("Tip: $%.2f%n", tip);
        System.out.printf("Total: $%.2f%n", total);
        System.out.printf("Per person: $%.2f%n", perPerson);

