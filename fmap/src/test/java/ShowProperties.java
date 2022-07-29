class ShowProperties {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toString();
        System.out.println(os);
        System.getProperties().list(System.out);
    }
}