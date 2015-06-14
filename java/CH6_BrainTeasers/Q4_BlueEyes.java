package CH6_BrainTeasers;

public class Q4_BlueEyes {

    /**
     * ##Question 4.4
     *
     * A bunch of men are on an island. A genie comes down and gathers everyone
     * together and places a magical hat on some people’s heads (i.e., at least
     * one person has a hat). The hat is magical: it can be seen by other people,
     * but not by the wearer of the hat himself. To remove the hat, those (and
     * only those who have a hat) must dunk themselves underwater at exactly
     * midnight. If there are n people and c hats, how long does it take the men
     * to remove the hats? The men cannot tell each other (in any way) that they
     * have a hat.
     */

    /**
     *
     * ###Solution
     *
     * **Case c=1:**
     *
     * Person with the hat on sees no other hats, goes the first night.
     *
     * **Case c=n:**
     *
     * *A person with a hat on:*
     *
     * 1. Sees n-1 hats.
     * 2. Is unsure whether c is n-1 or n.
     * 3. Seeing that hats are still there on day n-1 goes on night n.
     *
     * *A person without a hat on:*
     *
     * 1. Sees n hats.
     * 2. Is unsure whether c is n or n+1.
     * 3. Waits until night n, and sees all hats come off, so they do not interfere with the process.
     *
     */

}
