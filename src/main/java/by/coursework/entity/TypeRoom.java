package by.coursework.entity;

public class TypeRoom {
    private int idType;
    private String typeRoom;
    private int capacity;
    private double price;
    private String description;
    private String image;

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeRoom typeRoom1 = (TypeRoom) o;

        if (idType != typeRoom1.idType) return false;
        if (capacity != typeRoom1.capacity) return false;
        if (Double.compare(typeRoom1.price, price) != 0) return false;
        if (typeRoom != null ? !typeRoom.equals(typeRoom1.typeRoom) : typeRoom1.typeRoom != null) return false;
        if (description != null ? !description.equals(typeRoom1.description) : typeRoom1.description != null)
            return false;
        return image != null ? image.equals(typeRoom1.image) : typeRoom1.image == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idType;
        result = 31 * result + (typeRoom != null ? typeRoom.hashCode() : 0);
        result = 31 * result + capacity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TypeRoom{" +
                "idType=" + idType +
                ", typeRoom='" + typeRoom + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
