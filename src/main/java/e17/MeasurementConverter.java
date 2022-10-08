package e17;

public class MeasurementConverter {
    int value;
    ConversionType conversionType;

//    public MeasurementConverter(int value, ConversionType conversionType) {
//        this.value = value;
//        this.conversionType = conversionType;
//    }

    public static float convert(int value, ConversionType conversionType){
        for(ConversionType conv: ConversionType.values()){
            if(conv == conversionType){
                return conv.converter.convert(value);
            }
        }
        return 0;
    }

}
