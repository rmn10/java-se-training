public enum Cat {
    AEGEAN("The Aegean cat (Greek: γάτα του Αιγαίου) is a naturally occurring landrace of domestic cat originating from the Cycladic Islands of Greece. Development of the Aegean cat as a formal breed began in the early 1990s by breeders in the fledgling Greek cat fancy, but the variety has yet to be recognized by any major fancier and breeder organization. It is considered to be the only native Greek variety of cat.", 5),
    BALINESE("The Balinese is a long-haired breed of domestic cat with Siamese-style point coloration and sapphire-blue eyes. The Balinese is also known as the purebred long-haired Siamese, since it originated as a natural mutation of that breed, and hence is essentially the same cat with a medium-length silky coat and a distinctively plumed tail.",10),
    BENGAL("The Bengal is a domestic cat breed developed to look like exotic jungle cats such as leopards, ocelots, margays and clouded leopards. Bengal cats were developed by the selective breeding of domestic cats crossed then backcrossed and backcrossed once more with hybrids from the Asian leopard cat (ALC), Prionailurus bengalensis bengalensis, and domestic cat, with the goal of creating a confident, healthy, and friendly cat with a highly contrasted and vividly marked coat.",15),
    CYPRUS("The Cyprus cat is a landrace of domestic cat believed to be descended from cats of Egypt or Palestine brought to Cyprus by St. Helen to rid the island of snakes and vermin. It is not recognized as a formal breed by any major cat fancier and breeder organization.",8),
    KORAT("The Korat is a slate blue-grey, short-haired breed of domestic cat with a small to medium build and a low percentage of body fat. Its body is semi-cobby, and unusually heavy for its size. It is an intelligent and playful[1] active cat that forms strong bonds with people. Among the Korats' distinguishing characteristics is its heart-shaped head and large green eyes.",12);

    private String description;
    private int weight;

    Cat(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }


    public String getDescription() {
        return description;
    }
    public int getWeight() {
        return weight;
    }
}
