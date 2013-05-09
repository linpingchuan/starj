package starj.coffer.types;

public class FloatType extends BasicType {
    public String toTypeString() {
        return "F";
    }

    public String toString() {
        return "float";
    }

    public boolean equals(Object obj) {
        return (obj instanceof FloatType);
    }

    public int compareTo(Object obj) {
        if (obj instanceof FloatType) {
            return 0;
        } else if (obj instanceof Type) {
            return hashCode() - obj.hashCode();
        }

        throw new RuntimeException("Incompatible objects");
    }

    /* Experimental -- May be removed from the StarJ API at any time !! */
    public final int getTypeID() {
        return Type.FLOAT_TYPE;
    }
}
