package Day2;

public class Main {

    public static void main(String[] args) {

        Store orchidStore = new Store();
        Store lekkiStore = new Store();
        Store maryLandStore = new Store();
        Store ajahStore = new Store();


        Categories electronics = new Categories();
        Categories provision = new Categories();
        Categories fashion = new Categories();
        Categories bookShelf = new Categories();


        electronics.setType(new Type("panasonic", 25_000,
                true,5));
        electronics.setProvisions("Milo");
        provision.setType(new Type("Milk", 5_000,
                true,10));
        fashion.setType(new Type("Clothes",50_000,
                false, 0));
        bookShelf.setType(new Type("loveCode", 3000,
                true, 3 ));


        lekkiStore.setCategories(electronics);
        lekkiStore.getCategories().setElectronics("LG");
        maryLandStore.setCategories(provision);
        ajahStore.setCategories(fashion);
        orchidStore.setCategories(bookShelf);

        System.out.println(lekkiStore);
        System.out.println(maryLandStore);
        System.out.println(ajahStore);
        System.out.println(orchidStore);
    }
}





//        Library library = new Library();
//        Department historyDept = new Department();
//
//        Library deltaStateBranch = new Library();
//        deltaStateBranch.setDepartment(historyDept);
//
//        historyDept.setLiberianA(philip);
//        historyDept.setBorrowerA(samuel);
//        historyDept.setCleanerA(victor);
//
//        Liberian philip = new Liberian();
//        philip.setName("Philip");
//        Borrower samuel = new Borrower();
//        samuel.setName("Samuel");
//        Cleaner victor = new Cleaner();
//        victor.setName("Victor");
//
//
//
//        Borrower deltaStateBorrower = new Borrower();
//        deltaStateBorrower.setNationality("Nigeria");
//
//        Cleaner lagosStateCleaner = new Cleaner();
//        lagosStateCleaner.setName("victor");
//
//
//
//        System.out.println(library);










