/* Generated By:JavaCC: Do not edit this line. ExpReg.java */
package expReg;

import java.util.*;
public class ExpReg implements ExpRegConstants {
        ArrayList <String> nomSymb = new ArrayList<String>();
        ArrayList <String> nomVar = new ArrayList<String>();

  final public void ExpReg() throws ParseException {
    jj_consume_token(Begin);
    jj_consume_token(CAMBIO);
    Alphabet();
    jj_consume_token(CAMBIO);
    ER_NAME();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ER_NAMEi:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      ER_NAME();
    }
    jj_consume_token(End);
    jj_consume_token(0);
  }

  final public void Alphabet() throws ParseException {
    jj_consume_token(ALPHABET);
    jj_consume_token(13);
    symbol();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      jj_consume_token(14);
      symbol();
    }
    jj_consume_token(15);
  }

  final public void symbol() throws ParseException {
        Token t;
        System.out.println("ENTRO s");
    t = jj_consume_token(SYMB);
                nomSymb.add(t.image);
  }

  final public void Var() throws ParseException {
        Token t;
    t = jj_consume_token(ER_NAMEi);
                nomVar.add(t.image);
                System.out.println(nomVar.size());
  }

  final public void ER_NAME() throws ParseException {
    Var();
    jj_consume_token(16);
    ERi();
    jj_consume_token(CAMBIO);
  }

  final public void Revisar() throws ParseException {
        Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ER_NAMEi:
      t = jj_consume_token(ER_NAMEi);
      break;
    case SYMB:
      t = jj_consume_token(SYMB);
                boolean encontrado = false;
                int i = 0;
                while(i < nomVar.size() && !encontrado)
                {
                        encontrado = nomVar.get(i).equals(t.image);
                        i++;
                }
                i = 0;
                while(i < nomSymb.size() && !encontrado)
                {
                        encontrado = nomSymb.get(i).equals(t.image);
                        i++;
                }
                if(!encontrado)
                {
                        {if (true) throw new Error("no se ha encontrado la variable o simbolo " + t.image);}
                }
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void ERi() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 17:
      jj_consume_token(17);
      break;
    case 18:
      jj_consume_token(18);
      break;
    case ER_NAMEi:
    case SYMB:
    case 19:
    case 20:
    case 21:
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ER_NAMEi:
        case SYMB:
          Revisar();
          break;
        case 19:
          jj_consume_token(19);
          break;
        case 20:
          jj_consume_token(20);
          break;
        case 21:
          jj_consume_token(21);
          break;
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ER_NAMEi:
        case SYMB:
        case 19:
        case 20:
        case 21:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_3;
        }
      }
      break;
    case 22:
      jj_consume_token(22);
      ERi();
      jj_consume_token(23);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 19:
        case 20:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 19:
          jj_consume_token(19);
          break;
        case 20:
          jj_consume_token(20);
          break;
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public ExpRegTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x100,0x4000,0x300,0x380300,0x380300,0x180000,0x180000,0x7e0300,};
   }

  /** Constructor with InputStream. */
  public ExpReg(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ExpReg(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ExpRegTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ExpReg(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ExpRegTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ExpReg(ExpRegTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ExpRegTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[24];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 8; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 24; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}