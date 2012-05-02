package placements

class ApplyController {

    def index() { }
    def processApplication() {
    log.debug("Student id from form is ${params.studentId}");
    def located_student = Student.findByName(params.studentId)
    log.debug(located_student)

    def located_placement = PlacementOpportunity.findByJobTitle(params.jobTitle)
    log.debug(located_placement)
    
    def located_status = Status.findByCode ("01")
    log.debug(located_status)

def application = new Application(placement:located_placement, student:located_student, status:located_status).save();
redirect(controller:"Application",action:"list")
}
}
