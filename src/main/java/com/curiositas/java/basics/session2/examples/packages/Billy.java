package com.curiositas.java.basics.session2.examples.packages;

public class Billy {
    public void tellPublic() {
        System.out.println("It's a public Billy's method, available for everyone");
    }

    private void tellPrivate() {
        System.out.println("It's a private Billy's method, available only for Billy");
    }

    protected void tellProtected() {
        System.out.println("It's a protected Billy's method, available for Billy, his children and his package");
    }

    void tellPackagePrivate() {
        System.out.println("It's a package-private Billy's method, available for Billy and his package");
    }

    public void forceBillyToCallPrivateMethod() {
        tellPrivate();
    }

    public void forceBillyToCallProtectedMethod() {
        tellProtected();
    }

    public void forceBillyToCallPackagePrivateMethod() {
        tellPackagePrivate();
    }
}
