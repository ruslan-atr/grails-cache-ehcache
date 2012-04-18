grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
	}

	dependencies {
		compile 'net.sf.ehcache:ehcache-core:2.4.6'
	}

	plugins {
		build(':release:2.0.0', ':rest-client-builder:1.0.2') {
			export = false
		}
		compile ':cache:0.5.BUILD-SNAPSHOT'
	}
}