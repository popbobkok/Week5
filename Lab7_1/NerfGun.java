/*
    Name : Natthapong Tung-uan
    Student ID : 632115019
    Class : SE
.
.
.
    Work : LAB 7-1 encapsulation2
*/

public class NerfGun {

    private int Ammo = 0;
    private int idCount;

    public NerfGun(int A) {

        this.Ammo = A;
        idCount = +2; // please forgive me Sensei TwT
    }

    public NerfGun() {

        this.Ammo = 0;
        idCount = +1;
    }

    public int fire() {

        if (this.Ammo <= 0) {
            System.out.println("There is no ammuition");
        } else {
            this.Ammo = this.Ammo - 1;
            System.out.println("BANG!!");

        }

        return this.Ammo;
    }

    public int reload(int r) {
        int totalAmmo = r + this.Ammo;
        if (totalAmmo > 15 || totalAmmo < 0) {
            System.out.println("Error!! the ammunition is overload");
        } else {
            this.Ammo = Ammo + r;
        }

        return this.Ammo;
    }

    public String displayNumOfAmmunition() {

        System.out.println(String.valueOf(this.Ammo) + " bullet left");
        return "none";
    }

    public String displayGunID() {
        System.out.println("The id of this gun is " + idCount);
        return "none";
    }

}