package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer dcou = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            dcou.countIn(super.countOut());

        int ret = dcou.countOut();

        while (!dcou.callCheck())

            countIn(dcou.countOut());

        return ret;
    }

    
}
