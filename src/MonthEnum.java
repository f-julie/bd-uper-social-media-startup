public enum MonthEnum {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    @Override
    public String toString() {
        return super.toString().substring(0, 3);
    }
}
