public class _0_operators {
    public static void main(String[] args) {
        boolean isRich = true;
        boolean isMerciful = false;
        boolean hasCriminalRecord = false;

        boolean isEligibleToParticipate = (isRich || isMerciful) && !hasCriminalRecord;
        System.out.println(isEligibleToParticipate);
    }
}
