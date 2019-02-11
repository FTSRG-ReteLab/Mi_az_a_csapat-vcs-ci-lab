package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.time.Instant;

public class TrainTachograph {
    // current time, joystick position, reference speed
    Table<Instant, Integer, Integer> values = HashBasedTable.create();

    TrainTachograph() {
        //Insert some dummy data
        record(0,0);
    }

    public void record(int joystickPosition, int referenceSpeed) {
        values.put(Instant.now(), joystickPosition, referenceSpeed);
    }

}
