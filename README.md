```
sbt:bug> compile
[info] Compiling 1 Scala source to /private/tmp/bug/target/scala-2.12/classes ...
[error] /private/tmp/bug/src/main/scala/bug.scala:7:15: value bogus is not a member of bug.Foo[A]
[error]   new Foo(5L).bogus[(Long, Long)]
[error]               ^
[error] ## Exception when compiling 1 sources to /private/tmp/bug/target/scala-2.12/classes
[error] assertion failed:
[error]   Context(bug.scala) {
[error]    owner       = value <local Bar>
[error]    tree        = TypeApply:new Foo(5L).<bogus: error>[scala.Tuple2[Long, Long]]
[error]    scope       = 0 decls
[error]    contextMode = AmbiguousErrors MacrosEnabled TypeConstructorAllowed
[error]    outer.owner = object Bar
[error] }
[error]      while compiling: /private/tmp/bug/src/main/scala/bug.scala
[error]         during phase: typer
[error]      library version: version 2.12.7
[error]     compiler version: version 2.12.7
[error]   reconstructed args: -bootclasspath /nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/resources.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/rt.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/sunrsasign.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jsse.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jce.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/charsets.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jfr.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/classes:/Users/dstewart/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.12.7.jar -classpath /private/tmp/bug/target/scala-2.12/classes
[error]
[error]   last tree to typer: Ident(scala)
[error]        tree position: line 7 of /private/tmp/bug/src/main/scala/bug.scala
[error]             tree tpe: scala.type
[error]               symbol: final package scala
[error]    symbol definition: final package scala (a ModuleSymbol)
[error]       symbol package: <none>
[error]        symbol owners: package scala
[error]            call site: object Bar in package bug in package bug
[error]
[error] == Source file context for tree position ==
[error]
[error]      4
[error]      5 object Bar {
[error]      6   // Traceback in the README.md
[error]      7   new Foo(5L).bogus[(Long, Long)]
[error]      8
[error]      9   // [error] /private/tmp/bug/src/main/scala/bug.scala:10:16: value bogus is not a member of bug.Foo[A]
[error]     10   // [error]   new Foo(???).bogus[Long]
[error] scala.reflect.internal.SymbolTable.throwAssertionError(SymbolTable.scala:163)
[error] scala.tools.nsc.typechecker.Typers$Typer.vanillaAdapt$1(Typers.scala:1169)
[error] scala.tools.nsc.typechecker.Typers$Typer.adapt(Typers.scala:1223)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5631)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$60(Typers.scala:5033)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedTypeSelectionQualifier$1(Typers.scala:5033)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedSelectOrSuperCall$1(Typers.scala:5041)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5572)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedAppliedTypeTree$1(Typers.scala:5166)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5524)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedHigherKindedType$2(Typers.scala:5679)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedHigherKindedType(Typers.scala:5754)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$82(Typers.scala:5381)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedTypeApply$1(Typers.scala:5381)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedOutsidePatternMode$1(Typers.scala:5548)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5581)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:5681)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3264)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3264)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:1999)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:1868)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5538)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:5681)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3264)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3264)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5247)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5540)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error] scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:106)
[error] scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:441)
[error] scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.run(Analyzer.scala:96)
[error] scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1467)
[error] scala.tools.nsc.Global$Run.compileUnits(Global.scala:1451)
[error] scala.tools.nsc.Global$Run.compileSources(Global.scala:1444)
[error] scala.tools.nsc.Global$Run.compile(Global.scala:1567)
[error] xsbt.CachedCompiler0.run(CompilerInterface.scala:130)
[error] xsbt.CachedCompiler0.run(CompilerInterface.scala:105)
[error] xsbt.CompilerInterface.run(CompilerInterface.scala:31)
[error] sun.reflect.GeneratedMethodAccessor20.invoke(Unknown Source)
[error] sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] java.lang.reflect.Method.invoke(Method.java:498)
[error] sbt.internal.inc.AnalyzingCompiler.call(AnalyzingCompiler.scala:237)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:111)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:90)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3(MixedAnalyzingCompiler.scala:82)
[error] scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
[error] sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:133)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:73)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:116)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:307)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:307)
[error] sbt.internal.inc.Incremental$.doCompile(Incremental.scala:106)
[error] sbt.internal.inc.Incremental$.$anonfun$compile$4(Incremental.scala:87)
[error] sbt.internal.inc.IncrementalCommon.recompileClasses(IncrementalCommon.scala:116)
[error] sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:63)
[error] sbt.internal.inc.Incremental$.$anonfun$compile$3(Incremental.scala:89)
[error] sbt.internal.inc.Incremental$.manageClassfiles(Incremental.scala:134)
[error] sbt.internal.inc.Incremental$.compile(Incremental.scala:80)
[error] sbt.internal.inc.IncrementalCompile$.apply(Compile.scala:67)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:311)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:269)
[error] sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:159)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:238)
[error] sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:69)
[error] sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:1544)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:1518)
[error] scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:40)
[error] sbt.std.Transform$$anon$4.work(System.scala:67)
[error] sbt.Execute.$anonfun$submit$2(Execute.scala:269)
[error] sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] sbt.Execute.work(Execute.scala:278)
[error] sbt.Execute.$anonfun$submit$1(Execute.scala:269)
[error] sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
[error] java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
[error] java.lang.Thread.run(Thread.java:745)
[error]
[error] java.lang.AssertionError: assertion failed:
[error]   Context(bug.scala) {
[error]    owner       = value <local Bar>
[error]    tree        = TypeApply:new Foo(5L).<bogus: error>[scala.Tuple2[Long, Long]]
[error]    scope       = 0 decls
[error]    contextMode = AmbiguousErrors MacrosEnabled TypeConstructorAllowed
[error]    outer.owner = object Bar
[error] }
[error]      while compiling: /private/tmp/bug/src/main/scala/bug.scala
[error]         during phase: typer
[error]      library version: version 2.12.7
[error]     compiler version: version 2.12.7
[error]   reconstructed args: -bootclasspath /nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/resources.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/rt.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/sunrsasign.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jsse.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jce.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/charsets.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jfr.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/classes:/Users/dstewart/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.12.7.jar -classpath /private/tmp/bug/target/scala-2.12/classes
[error]
[error]   last tree to typer: Ident(scala)
[error]        tree position: line 7 of /private/tmp/bug/src/main/scala/bug.scala
[error]             tree tpe: scala.type
[error]               symbol: final package scala
[error]    symbol definition: final package scala (a ModuleSymbol)
[error]       symbol package: <none>
[error]        symbol owners: package scala
[error]            call site: object Bar in package bug in package bug
[error]
[error] == Source file context for tree position ==
[error]
[error]      4
[error]      5 object Bar {
[error]      6   // Traceback in the README.md
[error]      7   new Foo(5L).bogus[(Long, Long)]
[error]      8
[error]      9   // [error] /private/tmp/bug/src/main/scala/bug.scala:10:16: value bogus is not a member of bug.Foo[A]
[error]     10   // [error]   new Foo(???).bogus[Long]
[error]         at scala.reflect.internal.SymbolTable.throwAssertionError(SymbolTable.scala:163)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.vanillaAdapt$1(Typers.scala:1169)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.adapt(Typers.scala:1223)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5631)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$60(Typers.scala:5033)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedTypeSelectionQualifier$1(Typers.scala:5033)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedSelectOrSuperCall$1(Typers.scala:5041)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5572)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedAppliedTypeTree$1(Typers.scala:5166)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5524)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedHigherKindedType$2(Typers.scala:5679)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedHigherKindedType(Typers.scala:5754)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typed1$82(Typers.scala:5381)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedTypeApply$1(Typers.scala:5381)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedOutsidePatternMode$1(Typers.scala:5548)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5581)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:5681)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3264)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3264)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:1999)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:1868)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5538)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:5681)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3264)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3264)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5247)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5540)
[error]         at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:5617)
[error]         at scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:106)
[error]         at scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:441)
[error]         at scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.run(Analyzer.scala:96)
[error]         at scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1467)
[error]         at scala.tools.nsc.Global$Run.compileUnits(Global.scala:1451)
[error]         at scala.tools.nsc.Global$Run.compileSources(Global.scala:1444)
[error]         at scala.tools.nsc.Global$Run.compile(Global.scala:1567)
[error]         at xsbt.CachedCompiler0.run(CompilerInterface.scala:130)
[error]         at xsbt.CachedCompiler0.run(CompilerInterface.scala:105)
[error]         at xsbt.CompilerInterface.run(CompilerInterface.scala:31)
[error]         at sun.reflect.GeneratedMethodAccessor20.invoke(Unknown Source)
[error]         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error]         at java.lang.reflect.Method.invoke(Method.java:498)
[error]         at sbt.internal.inc.AnalyzingCompiler.call(AnalyzingCompiler.scala:237)
[error]         at sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:111)
[error]         at sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:90)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3(MixedAnalyzingCompiler.scala:82)
[error]         at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:133)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:73)
[error]         at sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:116)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:307)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:307)
[error]         at sbt.internal.inc.Incremental$.doCompile(Incremental.scala:106)
[error]         at sbt.internal.inc.Incremental$.$anonfun$compile$4(Incremental.scala:87)
[error]         at sbt.internal.inc.IncrementalCommon.recompileClasses(IncrementalCommon.scala:116)
[error]         at sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:63)
[error]         at sbt.internal.inc.Incremental$.$anonfun$compile$3(Incremental.scala:89)
[error]         at sbt.internal.inc.Incremental$.manageClassfiles(Incremental.scala:134)
[error]         at sbt.internal.inc.Incremental$.compile(Incremental.scala:80)
[error]         at sbt.internal.inc.IncrementalCompile$.apply(Compile.scala:67)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:311)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:269)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:159)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:238)
[error]         at sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:69)
[error]         at sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:1544)
[error]         at sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:1518)
[error]         at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error]         at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:40)
[error]         at sbt.std.Transform$$anon$4.work(System.scala:67)
[error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:269)
[error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error]         at sbt.Execute.work(Execute.scala:278)
[error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:269)
[error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error]         at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]         at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error]         at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
[error]         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
[error]         at java.lang.Thread.run(Thread.java:745)
[error] (Compile / compileIncremental) java.lang.AssertionError: assertion failed:
[error]   Context(bug.scala) {
[error]    owner       = value <local Bar>
[error]    tree        = TypeApply:new Foo(5L).<bogus: error>[scala.Tuple2[Long, Long]]
[error]    scope       = 0 decls
[error]    contextMode = AmbiguousErrors MacrosEnabled TypeConstructorAllowed
[error]    outer.owner = object Bar
[error] }
[error]      while compiling: /private/tmp/bug/src/main/scala/bug.scala
[error]         during phase: typer
[error]      library version: version 2.12.7
[error]     compiler version: version 2.12.7
[error]   reconstructed args: -bootclasspath /nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/resources.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/rt.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/sunrsasign.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jsse.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jce.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/charsets.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/lib/jfr.jar:/nix/store/5jw2r7csrk1nhy66jawi4yjn7jr3xglm-zulu1.8.0_121-8.20.0.5/jre/classes:/Users/dstewart/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.12.7.jar -classpath /private/tmp/bug/target/scala-2.12/classes
[error]
[error]   last tree to typer: Ident(scala)
[error]        tree position: line 7 of /private/tmp/bug/src/main/scala/bug.scala
[error]             tree tpe: scala.type
[error]               symbol: final package scala
[error]    symbol definition: final package scala (a ModuleSymbol)
[error]       symbol package: <none>
[error]        symbol owners: package scala
[error]            call site: object Bar in package bug in package bug
[error]
[error] == Source file context for tree position ==
[error]
[error]      4
[error]      5 object Bar {
[error]      6   // Traceback in the README.md
[error]      7   new Foo(5L).bogus[(Long, Long)]
[error]      8
[error]      9   // [error] /private/tmp/bug/src/main/scala/bug.scala:10:16: value bogus is not a member of bug.Foo[A]
[error]     10   // [error]   new Foo(???).bogus[Long]
[error] Total time: 0 s, completed Nov 4, 2018 9:24:32 PM
```
