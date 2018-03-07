public enum GenreType {
        BIOGRAPHY("An account of someone's life written by someone else."),
        POLITICAL("Ideas or strategies of a particular party or group in politics."),
        ROMANCE("Stories that evolve about the two people as they develop romantic love for each other and work to build a relationship."),
        COOKERY("Recipes and other information about the preparation and cooking of food.");


        private final String value;

        GenreType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
}

