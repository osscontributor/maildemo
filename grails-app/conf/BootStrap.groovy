class BootStrap {

    def mailService
    def init = { servletContext ->
        mailService.sendMail {
            from "jeff@jeffandbetsy.net"
            to "jbrown@gopivotal.com"
            subject "Hello"
            body "This is a test"
        }
    }
    def destroy = {
    }
}
