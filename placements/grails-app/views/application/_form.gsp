<%@ page import="placements.Application" %>



<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'placement', 'error')} ">
	<label for="placement">
		<g:message code="application.placement.label" default="Placement" />
		
	</label>
	<g:textField name="placement" value="${applicationInstance?.placement}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="application.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="status" name="status.id" from="${placements.Status.list()}" optionKey="id" required="" value="${applicationInstance?.status?.description}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'student', 'error')} ">
	<label for="student">
		<g:message code="application.student.label" default="Student" />
		
	</label>
	<g:textField name="student" value="${applicationInstance?.student}"/>
</div>



