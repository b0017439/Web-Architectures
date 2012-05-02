package placements

class ApplyController {

    def index() { }
    def processApplication() {
    log.debug("Student id from form is ${params.studentId}");
    def located_student = Student.findByName(params.studentId)
    log.debug(located_student)

    def located_placement = Placement.findByjobTitle(params.jobTitle)
    log.debug(location_placement)
    
    def located_status = Status.findByCode ("01")
    log.debug(location_status)

def application = new Application(placement:located_placement, student:located_student, status:located_status).save();
}
}
