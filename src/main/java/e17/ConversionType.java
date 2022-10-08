package e17;

public enum ConversionType {
    METERS_TO_YARDS(new Converter() {
        @Override
        public float convert(float distance) {
            return distance * 1.0936f;
        }
    }),
    YARDS_TO_METERS(new Converter() {
        @Override
        public float convert(float distance) {
            return distance * 0.9144f;
        }
    }),
    CENTIMETERS_TO_INCHES(new Converter() {
        @Override
        public float convert(float distance) {
            return distance * 0.393701f;
        }
    }),
    INCHES_TO_CENTIMETERS(new Converter() {
        @Override
        public float convert(float distance) {
            return distance * 2.54f;
        }
    }),
    KILOMETERS_TO_MILES(new Converter() {
        @Override
        public float convert(float distance) {
            return distance * 0.62137119f;
        }
    }),
    MILES_TO_KILOMETERS(new Converter() {
        @Override
        public float convert(float distance) {
            return distance * 1.6f;
        }
    });

    final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
