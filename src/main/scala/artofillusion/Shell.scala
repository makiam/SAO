package artofillusion

import groovy.lang.GroovyShell
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer

trait Shell {
  private val cc: CompilerConfiguration = new CompilerConfiguration
  private val ic = new ImportCustomizer
  ic.addStarImports(ArtOfIllusion.getClass.getPackage.getName)
  cc.addCompilationCustomizers(ic)

  def shell = new GroovyShell(cc)
}
