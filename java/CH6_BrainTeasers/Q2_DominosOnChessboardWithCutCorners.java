package CH6_BrainTeasers;

public class Q2_DominosOnChessboardWithCutCorners {

    /**
     *
     * Total number of tiles before cutting corners.
     * 8 * 8 = 64
     *
     * Cutting corners:
     * 64 - 2 = 62
     *
     * Tiles covered by 31 dominos:
     * 62
     *
     * So we're at... maybe...
     *
     * Here's our chess board:
     *
     * ```
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ```
     *
     * Now cut off the corners:
     *
     * ```
     *  □■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□■
     * ■□■□■□■□■□■□■□■□
     * □■□■□■□■□■□■□■□
     * ```
     *
     * If each domino is either horizontal or vertical it must cover a white and a black tile.
     * There are 32 white tiles, and 30 black tiles.
     * So you can only fit 30 dominos on this board.
     *
     */

}
