export class User{
    userId:number=0;
    userName:string="";
    userAge:number=0;
    userSalary:number=0;
    showForm:boolean=false;

    constructor(id:number, name:string, age:number, salary:number) {
        this.userId=id;
        this.userName=name;
        this.userAge=age;
        this.userSalary=salary;
        this.showForm=false;
    }

    setUserId(id:number) {
        this.userId=id;
    }
    setUserName(name:string) {
        this.userName=name;
    }
    setUserAge(age:number) {
        this.userAge=age;
    }
    setUserSalary(salary:number) {
        this.userSalary=salary;
    }
    setShowForm(showform:boolean) {
        this.showForm=showform;
    }
    getShowForm() {
        return this.showForm;
    }
}