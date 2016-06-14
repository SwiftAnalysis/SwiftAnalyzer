package swiftanalysis.output.messages;

import swiftanalysis.output.MetricType;

/**
 * Note: this class has a natural ordering that is inconsistent with equals.
 */
public class MetricMessage {

    private String filePath = "";
    private MetricType type;
    private int lineNumber;
    private int columnNumber;
    private int lineNumberWidth = 0;
    private int columnNumberWidth = 0;
    private String metricMessage = "";

    /**
     * Constructs a MetricMessage with the specified message components.
     *
     * @param filePath         the path of the source file
     * @param type             the type associated with the metric
     * @param lineNumber       the logical line number in the source file
     * @param columnNumber     the logical column number in the source file
     * @param severity         the severity of the violation message
     * @param metricMessage    the description of the metric message
     */
    public MetricMessage(String filePath, MetricType type, int lineNumber, int columnNumber, String metricMessage) {
        this.filePath = filePath;
        this.type = type;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
        this.metricMessage = metricMessage;
    }
    
    /**
    * Constructs a MetricMessage with the specified message components.
    *
    * @param type             the type associated with the metric
    * @param lineNumber       the logical line number in the source file
    * @param columnNumber     the logical column number in the source file
    * @param severity         the severity of the violation message
    * @param metricMessage    the description of the metric message
    */
   public MetricMessage(MetricType type, int lineNumber, int columnNumber, String metricMessage) {
       this.type = type;
       this.lineNumber = lineNumber;
       this.columnNumber = columnNumber;
       this.metricMessage = metricMessage;
   }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public String getMessage() {
        return metricMessage;
    }
    
    public MetricType getType() {
        return type;
    }

    public String getFilePath() {
        return filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setLineNumberWidth(int lineNumberWidth) {
        this.lineNumberWidth = lineNumberWidth;
    }

    public void setColumnNumberWidth(int columnNumberWidth) {
        this.columnNumberWidth = columnNumberWidth;
    }

    public void setType(MetricType type) {
        this.type = type;
    }
    
    @Override
    /**
     * Implementation required since equals() is overridden.
     */
    public int hashCode() {
        int result = filePath.hashCode();
        result = 31 * result + lineNumber;
        result = 31 * result + columnNumber;
        result = 31 * result + type.hashCode();
        result = 31 * result + metricMessage.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricMessage)) {
            return false;
        }

        MetricMessage candidateObject = (MetricMessage) obj;

        // Test primitives (int) for equality first, then objects (String)
        return (this.lineNumber == candidateObject.lineNumber)
            && (this.columnNumber == candidateObject.columnNumber)
            && (this.filePath.equals(candidateObject.filePath))
            && (this.type.equals(candidateObject.type))
            && (this.metricMessage.equals(candidateObject.metricMessage));
    }

    @Override
    public String toString() {
        
    	if (this.filePath.isEmpty()  && this.type == null) {
            return "";
        }

       return String.format("%s%s%s %s %s", formattedFilePath(), formattedLineNumber(), formattedColumnNumber(),
    		   formattedType(), formattedMetricMessage());
    }

    private String formattedFilePath() {
        return String.format("%s:", filePath);
    }

    private String formattedLineNumber() {
        return String.format("%0" + lineNumberWidth + "d:", lineNumber);
    }

    private String formattedColumnNumber() {
        return String.format("%0" + columnNumberWidth + "d:", columnNumber);
    }

    private String formattedType() {
        return String.format("%s:", type.getName());
    }

    private String formattedMetricMessage() {
        return metricMessage;
    }

}
