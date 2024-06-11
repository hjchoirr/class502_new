package exam02;

public enum Transportation {
    BUS(1350) {
        public int getTotal(int person) {
            return getFare() * person;
        }
    },
    SUBWAY(1450) {
        public int getTotal(int person) {
            return getFare() * person;
        }
    },
    TAXI(4800) {
        public  int getTotal(int person) {
            return getFare() * person;
        }
    };

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    };

    public int getFare() {
        return fare;
    }
    public abstract int getTotal(int person);

}
// BUS, SUBWAY, TAXI : 상수 인데 객체 => 정적 상수 객체
// Transportation 이라는 enum 객체