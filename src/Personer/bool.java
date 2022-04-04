package Personer;

import java.util.ArrayList;

public class bool {
    public bool(ArrayList<Integer> tall) {
    }

    public int storst (ArrayList<Integer> list){

        int storsteTall = list.get(0);

        for (int i : list) {

            if (storsteTall < i) {
                storsteTall = i;
            }
        }
        return storsteTall;
    }
    public int minst (ArrayList<Integer> list){

        int minsteTall = list.get(0);

        for (int i : list) {

            if (minsteTall > i) {
                minsteTall = i;
            }
        }
        return minsteTall;
    }

}
