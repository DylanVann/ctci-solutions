package CH6_BrainTeasers;

public class Q3_Jug {

    int waterQuarts;
    int totalQuarts;

    Q3_Jug(int totalQuarts) {
        this.totalQuarts = totalQuarts;
    }

    void pourInto(Q3_Jug jug) {
        if (jug.freeQuarts() >= this.waterQuarts) {
            // Transfer all the water from this jug into the next.
            jug.waterQuarts += this.waterQuarts;
            // This jug will become empty.
            this.waterQuarts = 0;
        }
        else {
            // There's not enough space to transfer it all.
            // This jug will transfer some water.
            this.waterQuarts -= jug.freeQuarts();
            // The other will be filled up.
            jug.waterQuarts  = jug.totalQuarts;
        }
    }

    void fill() {
        this.waterQuarts = totalQuarts;
    }

    void empty() {
        this.waterQuarts = 0;
    }

    int freeQuarts() {
        return this.totalQuarts - this.waterQuarts;
    }

}
