class Branch {
    int branchid;
    String branchName;
    String location;
    String telNo;

    public Branch(int branchid, String branchName, String location, String telNo) {
        this.branchid = branchid;
        this.branchName = branchName;
        this.location = location;
        this.telNo = telNo;
    }
}

class Bank
{
    int bankid;
    String bankName;
    Branch branch;

    public Bank(int bankid, String bankName, int branchid, String branchName, String location) {
        this.bankid = bankid;
        this.bankName = bankName;
        this.branch = new Branch(branchid, branchName, location);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankid=" + bankid +
                ", bankName='" + bankName + '\'' +
                ", branch=" + branch.branchid +
                '}';
    }
}

public class Demo {
    public static void main(String[] args) {
        Bank B = new Bank(11,"XYZ",100,"ABC","USA");
        System.out.println(B);
    }
}
