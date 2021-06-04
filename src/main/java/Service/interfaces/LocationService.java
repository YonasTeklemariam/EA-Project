package Service.interfaces;

import Domain.Location;

public interface LocationService {
    void saveLocation(Location location);
    Location getLocation(String building, String roomNumber);
    void deleteLocation(String building, String roomNumber);
    boolean updateLocation(String building, String roomNumber);
}
