import java.text.NumberFormat;


public class CD
{

	/**
	 * title of CD
	 */
	private String title;
	
	/**
	 * musician
	 */
	private String artist;
	
	/**
	 * cost of CD
	 */
	private double cost;
	
	/**
	 * number of tracks used
	 */
	private int tracks;

	/**
	 * preconditions: title, artist cannot be null &  cost, tracks must be positive
	 * @param title 
	 * @param artist
	 * @param cost
	 * @param tracks
	 * @throws IllegalArgumentException if precondition is not true
	 */
	public CD(String title, String artist, double cost, int tracks)
	{
		setTitle (title);
		if (artist == null)
			throw new IllegalArgumentException ("artist is null");
		setCost (cost);
		if (tracks <= 0)
			throw new IllegalArgumentException ("tracks is negative");
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * precondition: title cannot be null
	 * @param title the title to set
	 * @throws IllegalArgumentException if title is null
	 */
	public void setTitle(String title)
	{
		if (title == null)
			throw new IllegalArgumentException ("title is null");
		this.title = title;
	}

	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * precondition: cost must be positive
	 * @param cost the cost to set
	 * @throws new IllegalArgumentException if cost is not positive
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * @return the artist
	 */
	public String getArtist()
	{
		return artist;
	}

	/**
	 * @return the tracks
	 */
	public int getTracks()
	{
		return tracks;
	}
	
		/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		CD other = (CD)obj;
		return title.equals(other.artist) && artist.equals(other.artist);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return "title: " + title + " artist: " + artist + " cost: " + fmt.format(cost) + " tracks: " + tracks;
	}
	
	
}
