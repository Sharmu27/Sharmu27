class OuterStatic {
    static class PublicNested {
        void show() {
            System.out.println("Sharmu");
            System.out.println(2024503055);
            System.out.println("Public Static Nested Class");
        }
    }

    private static class PrivateNested {
        void show() {
            System.out.println("Private Static Nested Class");
        }
    }

    void accessPrivateNested() {
        PrivateNested p = new PrivateNested();
        p.show();
    }

    public static void main(String[] args) {
        PublicNested pub = new PublicNested();
        pub.show();

        OuterStatic outer = new OuterStatic();
        outer.accessPrivateNested();
    }
}