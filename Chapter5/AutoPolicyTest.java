public class AutoPolicyTest {
    public static void main(String[] args){
        Autopolicy policy1 = new Autopolicy(11111111, "Toyota Camry", "NJ");
        Autopolicy policy2 = new Autopolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(Autopolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d;  Car: %s; State %s %s a no-falt state%n%n", 
        policy.getAccountNumber(), policy.getAccountNumber(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
    }
}
