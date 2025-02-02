package gr.cup.mathesis.elibrary.model;

/**
 * A DVD that contains one or more movies.
 *
 *
 * @author mathesis
 */
public final class DVD extends Disk {

    public enum Genre {
        UNCATEGORIZED, ACTION, COMEDY, DOCUMENTARY, DRAMA, FANTASY, HORROR, ROMANCE, SCIFI, THRILLER;
    }

    /**
     * Maximum length of a music DVD in minutes.
     */
    public static final int MAX_LENGTH = 360;
    /**
     * Maximum size of a DVD in MB.
     */
    public static final int MAX_SIZE = 9000;

    /**
     * First DVD.
     */
    public static final int MIN_PUB_YEAR = 1996;

    private DVD.Genre genre = DVD.Genre.UNCATEGORIZED;
    private int length = 0; // in minutes

    public DVD(String album, int len, int size, int pubYear, DVD.Genre genre) {
        super(album, size, pubYear);
        setLength(len);
        setSize(size);
        setGenre(genre);
    }

    /**
     * @return the genre
     */
    public DVD.Genre getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(DVD.Genre genre) {
        this.genre = genre;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "DVD {Genre: " + genre + ", Length: " + getLength() + ", " + super.toString().substring(6);
    }

}
