/**
 *
 */
public class Switch {

    private static Cat getCat() {
        Cat[] cats = Cat.values();
        return cats[(int) (Math.random() * cats.length)];
    }

    public static void main(String[] args) {
        Cat cat = getCat();
        String url = null;
        switch (cat) {
            case AEGEAN:
                url = "http://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Aegean_cat.jpg/240px-Aegean_cat.jpg";
                break;
            case BALINESE:
                url = "http://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Old-Style_Balinese_Cat.png/353px-Old-Style_Balinese_Cat.png";
                break;
            case BENGAL:
                url = "http://www.petsworld.in/blog/wp-content/uploads/2014/07/bengal-cat-domestic.jpg";
                break;
            case CYPRUS:
                url = "http://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/CyprusShorthair.jpg/353px-CyprusShorthair.jpg";
                break;
            case KORAT:
                url = "http://dims.vetstreet.com/dims3/MMAH/crop/0x0%2B0%2B0/resize/645x380/quality/90/?url=http%3A%2F%2Fs3.amazonaws.com%2Fassets.prod.vetstreet.com%2Fa2%2F513b40a33d11e087a80050568d634f%2Ffile%2FKorat-3-645mk062211.jpg";
                break;
        }
        if (url != null) JFXImage.launch(cat.name(), url);
    }
}
