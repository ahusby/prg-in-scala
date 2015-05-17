// private class uten qulaifier etter private betyr at klassen er tilgjengelig for sin pakke og subpakker.
// Jeg skjønner ikke forskjellen på provate og protected når de er brukt på klasser.
package a {
  class A {
//    new aa.AA
  }
  package aa {
    private class AA
    class AA2{
      new AA
      new AA3
    }
    protected class AA3
    
    package aaa {
      class AAA {
        new AA
        new AA3
      }
    }
  }
}

package b {
  class B {
//    new a.aa.AA
  }
//  class B2 extends a.aa.AA3
}