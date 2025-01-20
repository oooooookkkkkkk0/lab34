package org.example;

public record Place(String streetName) {
    private static int residents = 0;
    private static int maxResidents = (int) (Math.random() * 15) + 1;

    public String getName() {
        return streetName;
    }

    public void addResident(Human human) throws WrongAmountOfResidentsException {
        residents++;
        try {
            if (human instanceof Pugovka && !((Pugovka) human).getFriends().isEmpty()) {
                residents += ((Pugovka) human).getFriends().size();
            }
        } catch (NullPointerException e) {
            residents++;
        }
        if (residents > maxResidents) throw new WrongAmountOfResidentsException(this);
    }
}
