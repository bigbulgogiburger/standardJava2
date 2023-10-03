package test11;

class Phone{
    String company;
    String model;

    public Phone(String company, String model) {
        this.company = company;
        this.model = model;
    }


    // equals를 오버라이딩해서 해당 클래스에서 equals를 호출 시에 하기에 작성된 기준을 본다.
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Phone){

            if(((Phone) obj).company.equals(this.company)
                    && ((Phone) obj).model.equals(this.model)){
                return true;
            };
        }
        return false;
    }

    //toString overriding -> intellJ에서 제공해주는 toString 오버라이딩 기능을 쓰면 참 편하다.
    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
