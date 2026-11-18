// LeetCode 1603 - Design Parking System
// Difficulty: Easy
class ParkingSystem {
    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }
        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }
        if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
}
/*
Test Case 1:
Input: ParkingSystem(1,1,0)
addCar(1) -> true

Test Case 2:
Input: ParkingSystem(1,1,0)
addCar(3) -> false
*/
