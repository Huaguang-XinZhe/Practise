package test;

class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Song s = (Song) obj;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getBpm() {
        return bpm;
    }

    public String getRating() {
        return rating;
    }

    public String toString() {
        // TODO: 2022/10/7 输出不同的值要更改这个方法 
        return title;
    }
}

