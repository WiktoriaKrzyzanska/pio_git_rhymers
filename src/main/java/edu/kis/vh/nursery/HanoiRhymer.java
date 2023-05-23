/**
 * Zaimportowanie paczki edu.kis.vh.nursery
 */

package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer jest klasą publiczną, która jest rozsczerzeniem klasy DefaultCountingOutRhymer
 * Zwraca ona liczbę odrzuconych testów
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * totalRejected odpowiada za zliczanie odrzuceń
     */
    int totalRejected = 0;

    /**
     *metoda reportRejected zwraca liczbę zwróconych testów
     * @return totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Metoda typu Override
     * @param in countIn
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}