package structural.adapter.classadapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }

    public static void main(String[] args) {
        EmployeeClassAdapter employee = new EmployeeClassAdapter();
        employee.setFullName("Mini Maus");
        employee.setJobTitle("CEO");
        employee.setOfficeLocation("Big Company, OSLO");

        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();

        System.out.println(cardDesigner.designCard(employee));
    }
}
